import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class RockPaperScissorsFrame extends JFrame {

    JPanel mainPnl = new JPanel();
    JPanel btnPnl = new JPanel();
    JPanel statsPnl = new JPanel();
    JPanel resultsPnl = new JPanel();

    JButton rockBtn = new JButton();
    JButton paperBtn = new JButton();
    JButton scissorsBtn = new JButton();
    JButton quitBtn = new JButton();

    ImageIcon rockIcon = new ImageIcon(new ImageIcon("src/Rock.jpeg").getImage().getScaledInstance(70, 60, Image.SCALE_DEFAULT));
    ImageIcon paperIcon = new ImageIcon(new ImageIcon("src/Paper.jpeg").getImage().getScaledInstance(70, 60, Image.SCALE_DEFAULT));
    ImageIcon scissorsIcon = new ImageIcon("src/Scissors.jpeg");
    ImageIcon QuitIcon = new ImageIcon("src/Quit.jpeg");

    JTextArea resultsArea;
    JScrollPane scrollPane;

    public RockPaperScissorsFrame() {
        // Set Frame
        setSize(600, 600);
        setTitle("RPS GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels
        createBtnPnl();
        createStatspnl(); // uncomment this line
        createResultsPnl();

        // Add panels to main panel
        mainPnl.setLayout(new BorderLayout());
        mainPnl.add(statsPnl, BorderLayout.NORTH);
        mainPnl.add(resultsPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPnl);

        setVisible(true);
    }






    private void createBtnPnl() {
        btnPnl.setLayout(new GridLayout(1, 3));
        btnPnl.setBorder(new TitledBorder(new EtchedBorder(), "Button Panel"));

        rockBtn.setIcon(rockIcon);
        paperBtn.setIcon(paperIcon);
        scissorsBtn.setIcon(scissorsIcon);
        quitBtn.setIcon(QuitIcon);

        btnPnl.add(rockBtn);
        btnPnl.add(paperBtn);
        btnPnl.add(scissorsBtn);
        btnPnl.add(quitBtn);
    }


    private  void createStatspnl()
    {
        statsPnl.setLayout(new GridLayout(3,1));
        statsPnl.setBorder(new TitledBorder(new EtchedBorder(),"STATS"));

        rockBtn.setIcon(rockIcon);
        btnPnl.add(rockBtn);


    }



   private void createResultsPnl() {
       JTextArea resultsArea = new JTextArea();
       resultsArea.setEditable(false);
       resultsArea.setPreferredSize(new Dimension(500, 300));

       JScrollPane scrollPane = new JScrollPane(resultsArea);
       scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

       resultsPnl.add(scrollPane, BorderLayout.CENTER);

   }




    public static void main(String[] args) {
        new RockPaperScissorsFrame();
    }
}
