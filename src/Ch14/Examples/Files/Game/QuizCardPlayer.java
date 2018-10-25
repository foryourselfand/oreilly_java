package Ch14.Examples.Files.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class QuizCardPlayer {
    private JTextArea display;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public static void main(String[] args) {
        new QuizCardPlayer().go();
    }

    private void go() {
        //Сформируем и выведем на экран GUI

        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(10, 20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nextButton = new JButton("Show Question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load Card Set");
        loadMenuItem.addActionListener(new OpenMenuListener());

        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 500);
        frame.setVisible(true);
    }

    private void loadFile(File file) {
        //Нужно создать ArrayList с карточками, считывая их из текстового файла,
        //вызванного из обработчика событий класса OpenMenuListener
        //Прочитать файл по одной строке за раз
        //и вызвать метод makeCard() для создания новой карточки из строки
        //(одна строка в файле содержим вопрос и ответ, разделенные символом /)

        cardList = new ArrayList<QuizCard>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null)
                makeCard(line);

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Пришло время показать первую карточку
        showNextCard();
    }

    private void makeCard(String lineToParse) {
        //Вызывается методом loadFile, берет строку из текстового файла,
        //делит ее на две части - вопрос и ответ - и создает новый объект QuizCard,
        //а затем добавляет его в ArrayList с помощью CardList

        String[] rezult = lineToParse.split("/");
        QuizCard card = new QuizCard(rezult[0], rezult[1]);
        cardList.add(card);
        System.out.println("made a card");
    }

    private void showNextCard() {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }

    public class NextCardListener implements ActionListener {
        //Если это вопрос, показываем ответ, иначе показываем следующий вопрос
        //Установим флан для того, что мы видим, - вопрос это или ответ
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isShowAnswer) {
                //Показываем ответ, так как вопрос уже был увиден
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;
            } else {
                //Показываем следующий вопрос
                if (currentCardIndex < cardList.size())
                    showNextCard();
                else {
                    //Больше карточек нет!
                    display.setText("That was last card");
                    nextButton.setEnabled(false);
                }
            }
        }
    }

    public class OpenMenuListener implements ActionListener {
        //Вызываем диалоговое окно, позволяющее пользователю выбирать,
        //Какой набор карточек открыть
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser();
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }
}
