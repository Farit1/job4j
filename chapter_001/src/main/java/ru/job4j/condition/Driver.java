package ru.job4j.condition;

public class Driver {
    private char license ='N';

    public void passExamOn(char category) { // Присваивает в переменную license категорию A,B или C
        this.license = category;
    }

    public boolean hasLicense() { //Возвращает true если license  равно A, B или C,  в противном случае false;
       return this.license == 'A' || this.license == 'B' || this.license == 'C';
    }


    /* *********************
       Проверяет полученное значение через переменную category с переменной license.
       Чтобы использовать функцию canDrive необходимо заранее присвоить в переменную license значение, категорию A,B,C, это делается функцией passExamOn
       В таком случае функция вернет какая категория водительского удостоверения у водителя
     ********************** */
    public boolean canDrive(char category) {
        return this.license == category;
    }
}
