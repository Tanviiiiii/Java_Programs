/* 
class App1
{
    Button bt;
    TextField tb;
     Label la;
}

Agar ham class App1 ko execute karwaenge tab Compilation Error aajyengi kuki:-
         Button class, Textfield class, Label class jab yeah teeno class execute hogi tab compiler inki exitence check karega. Aur woh exitence current folder mai check krega i.e. App1 mai. But compiler ko Button class, Textfield class, Label class, ni millega .Phir woh Current Package mai check karega aur waha bhi nhi mili ga. Therefore error aajayegi.


Error ko remove krney ke liye :
hamney TEENO class ke aage unke package ka naam link kar diya
*/



class App
{
   java.awt.Button bt;
   java.awt.TextField tb;
   java.awt.Label la;
}