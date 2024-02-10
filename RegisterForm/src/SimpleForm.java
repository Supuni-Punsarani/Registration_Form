import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class SimpleForm extends JFrame implements ActionListener{

    private JLabel title;
    private JLabel name;
    private JTextField tname;

    private JLabel pno;
    private  JTextField ptext;

    private  JLabel gen;

    private JButton sub;
    private JCheckBox textr;

    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup a;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;

    private JComboBox year;

    private  JLabel adr;

    private JTextArea atext;
    private JButton reset;

    private JTextArea tout;
    private JLabel res;

    private JTextArea resadd;

    private final String[] dates={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

    private final String [] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

    private final String[] years={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};

    public SimpleForm(){
        setTitle("Registration Form");
        setBounds(300,90,900,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        Container c = getContentPane();     //meka mulin damme c private variable ekk declare krl.combobox daddi c local variable ekk krnw
        c.setLayout(null);

        title=new JLabel("Registration Form");
        title.setFont(new Font("Arial",Font.PLAIN,30));
        title.setSize(300,30);
        title.setLocation(300,30);
        c.add(title);

        name=new JLabel("Name:");
        name.setFont(new Font("Arial",Font.PLAIN,20));
        name.setSize(100,20);
        name.setLocation(100,100);
        c.add(name);

        tname=new JTextField();
        tname.setFont(new Font("Arial",Font.PLAIN,15));
        tname.setSize(190,20);
        tname.setLocation(200,100);
        c.add(tname);

        pno=new JLabel("Mobile:");
        pno.setFont(new Font("Arial",Font.PLAIN,20));
        pno.setSize(100,20);
        pno.setLocation(100,150);
        c.add(pno);

         ptext=new JTextField();
        ptext.setFont(new Font("Arial",Font.PLAIN,15));
        ptext.setSize(190,20);
        ptext.setLocation(200,150);
        c.add(ptext);

        gen=new JLabel("Gender:");
        gen.setFont(new Font("Arial",Font.PLAIN,20));
        gen.setSize(100,20);
        gen.setLocation(100,200);
        c.add(gen);

         male=new JRadioButton("Male");
        male.setFont(new Font("Arial",Font.PLAIN,15));
        male.setSize(75,20);
        male.setLocation(200,200);
        male.setSelected(true);
        c.add(male);

         female=new JRadioButton("Female");
        female.setFont(new Font("Arial",Font.PLAIN,15));
        female.setSize(100,20);
        female.setLocation(200,225);
        female.setSelected(true);
        c.add(female);

         a=new ButtonGroup();
        a.add(male);
        a.add(female);

         dob=new JLabel("DOB:");
        dob.setFont(new Font("Arial",Font.PLAIN,20));
        dob.setSize(100,20);
        dob.setLocation(100,250);
        c.add(dob);

         date=new JComboBox(dates);
        date.setFont(new Font("Arial",Font.PLAIN,15));
        date.setSize(50,20);
        date.setLocation(200,250);
        c.add(date);

         month=new JComboBox(months);
        month.setFont(new Font("Arial",Font.PLAIN,15));
        month.setSize(60,20);
        month.setLocation(250,250);
        c.add(month);

         year=new JComboBox(years);
        year.setFont(new Font("Arial",Font.PLAIN,15));
        year.setSize(60,20);
        year.setLocation(310,250);
        c.add(year);

         adr=new JLabel("Address:");
        adr.setFont(new Font("Arial",Font.PLAIN,20));
        adr.setSize(100,20);
        adr.setLocation(100,300);
        c.add(adr);

         atext=new JTextArea();
        atext.setFont(new Font("Arial",Font.PLAIN,15));
        atext.setSize(200,75);
        atext.setLocation(200,300);
        atext.setLineWrap(true);
        c.add(atext);

        textr=new JCheckBox("Accept Terms and Conditions.");
        textr.setFont(new Font("Arial",Font.PLAIN,15));
        textr.setSize(250,20);
        textr.setLocation(150,400);
        c.add(textr);

        sub=new JButton("Submit");
        sub.setFont(new Font("Arial",Font.PLAIN,15));
        sub.setSize(100,20);
        sub.setLocation(200,450);
        sub.addActionListener( this);
        c.add(sub);

        reset=new JButton("Reset");
        reset.setFont(new Font("Arial",Font.PLAIN,15));
        reset.setSize(100,20);
        reset.setLocation(350,450);
        reset.addActionListener( this);
        c.add(reset);

         tout=new JTextArea();
        tout.setFont(new Font("Arial",Font.PLAIN,15));
        tout.setSize(300,400);
        tout.setLocation(500,100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

         res=new JLabel("");
        res.setFont(new Font("Arial",Font.PLAIN,20));
        res.setSize(500,25);
        res.setLocation(100,500);
        c.add(res);

        resadd=new JTextArea();
        resadd.setFont(new Font("Arial",Font.PLAIN,15));
        resadd.setSize(200,75);
        resadd.setLocation(500,175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub){
            if(textr.isSelected()){
                String data1;
                String data="Name:"+tname.getText()+"\n"+"Mobile:"+ptext.getText()+"\n";
                if(male.isSelected()) data1="Gender:Male"+"\n";
                else data1="Gender:Female"+"\n";
                String data2="DOB"+date.getSelectedItem()+"/"+month.getSelectedItem()+"/"+year.getSelectedItem()+"\n";
                String data3="Address"+atext.getText();
                tout.setText(data+data1+data2+data3);
                tout.setEditable(false);
                res.setText("Registration succesfully!");
            }
            else{
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the terms and conditions.");
            }
        }else if(e.getSource()==reset){
            String def="";
            tname.setText(def);
            ptext.setText(def);
            atext.setText(def);
            res.setText(def);
            tout.setText(def);
            textr.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);

        }

    }
}
