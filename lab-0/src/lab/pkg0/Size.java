/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg0;

/**
 *
 * @author Lili
 */
public enum Size {

    /**
     *
     */
    SMALL(32, 36, "Pequeno",'S'),

    /**
     *
     */
    MEDIUM(37, 44, "Médio",'M'),

    /**
     *
     */
    LARGE(45, 52, "Grande",'L');
 private final String description;
 private final int minValue;
 private final int maxValue;
 private final char code;

 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 @Override
 public String toString() {
 return this.description;
 }

    /**
     *
     * @return Descrição
     */
    public String getDescription() {
 return description;
 }

    /**
     *
     * @return Valor mínimo
     */
    public int getMinValue() {
 return minValue;
 }

    /**
     *
     * @return Valor máximo
     */
    public int getMaxValue() {
 return maxValue;
 }

    /**
     *
     * @return Código do produto
     */
    public char getCode() {
 return code;
 }

}