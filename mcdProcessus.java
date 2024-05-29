import javax.swing.*;
import java.awt.*;

public class mcdProcessus extends JFrame {
        // Processus
        private JPanel PJLP;// Panel processus

        // Labels processus
        private JLabel PLP, PIP, PRAP, PCP, PEP, PDP;

      // TextField fonts
      Font f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12;

      private JTextField IP; // Identite processus
      private JTextField RAP;// Resource affectee processus
      private JTextField CP;// Cout processus
      private JTextField EP;// Etat processus
      private JTextField DP;// Duree processus
      private JButton nextPage, lastPage;// Button to the next page

      public mcdProcessus(){
        super("Processus");
        setLayout(new BorderLayout());

        // Processus

        PJLP = new JPanel();// Another divsion

        // Headers
        PLP = new JLabel();
        PLP.setLayout(new BorderLayout());
        PIP = new JLabel("IP");
        PIP.setLayout(new BorderLayout());
        PRAP = new JLabel("RAP");
        PRAP.setLayout(new BorderLayout());
        PCP = new JLabel("CP");
        PCP.setLayout(new BorderLayout());
        PEP = new JLabel("EP");
        PEP.setLayout(new BorderLayout());
        PDP = new JLabel("DP");
        PDP.setLayout(new BorderLayout());

        // Font sets to the panels
        f5 = PLP.getFont();
        PLP.setFont(f5.deriveFont(Font.BOLD, 22));
        getContentPane().add(PLP, BorderLayout.CENTER);

        f8 = PLP.getFont();
        PIP.setFont(f8.deriveFont(Font.BOLD, 22));
        getContentPane().add(PIP, BorderLayout.CENTER);

        f9 = PRAP.getFont();
        PRAP.setFont(f9.deriveFont(Font.BOLD, 22));
        getContentPane().add(PRAP, BorderLayout.CENTER);

        f10 = PCP.getFont();
        PCP.setFont(f10.deriveFont(Font.BOLD, 22));
        getContentPane().add(PCP, BorderLayout.CENTER);

        f11 = PDP.getFont();
        PDP.setFont(f11.deriveFont(Font.BOLD, 22));
        getContentPane().add(PDP, BorderLayout.CENTER);

        f12 = PEP.getFont();
        PEP.setFont(f12.deriveFont(Font.BOLD, 22));
        getContentPane().add(PEP, BorderLayout.CENTER);

        // Inputs with place holder
        IP = new JTextField("Enter your identite");
        f = IP.getFont();
        IP.setFont(f.deriveFont(Font.BOLD, 22));

        RAP = new JTextField("Enter your resource affectee");
        f1 = RAP.getFont();
        RAP.setFont(f1.deriveFont(Font.BOLD, 22));

        CP = new JTextField("Enter your cout");
        f2 = CP.getFont();
        CP.setFont(f2.deriveFont(Font.BOLD, 22));

        EP = new JTextField("Enter your etat");
        f3 = EP.getFont();
        EP.setFont(f3.deriveFont(Font.BOLD, 22));

        DP = new JTextField("Enter your duree");
        f4 = DP.getFont();
        DP.setFont(f4.deriveFont(Font.BOLD, 22));

        nextPage = new JButton("Next");
        f6 = nextPage.getFont();
        nextPage.setFont(f6.deriveFont(Font.BOLD, 22));

        lastPage = new JButton("Last");
        f7 = lastPage.getFont();
        lastPage.setFont(f7.deriveFont(Font.BOLD, 22));

        // Add componets to JLabel
        PIP.add(IP);
        PRAP.add(RAP);
        PCP.add(CP);
        PDP.add(DP);
        PEP.add(EP);

        // ADD componets to PJLP
        PJLP.setLayout(new GridLayout(20, 20));
        PJLP.add(PIP);
        PJLP.add(PCP);
        PJLP.add(PEP);
        PJLP.add(PDP);
        PJLP.add(PRAP);
        PJLP.add(nextPage);
        // End processus
        
        add(PJLP);
      }
}
