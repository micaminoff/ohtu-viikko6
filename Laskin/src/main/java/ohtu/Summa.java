/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author squid
 */
class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int lastVal;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.lastVal = 0;
    }

    @Override
    public void suorita() {
        this.lastVal = sovellus.tulos();
        System.out.println(sovellus.tulos());
        sovellus.plus(Integer.parseInt(syotekentta.getText()));
        this.syotekentta.setText("");
        this.tuloskentta.setText(""+sovellus.tulos());
    }

    @Override
    public void peru() {
        this.syotekentta.setText("");
        this.tuloskentta.setText(""+this.lastVal);
    }
    
}
