import java.sql.*;
import java.util.*;

class App
{
Connection c1;
ResultSet rst;
Random ra;
Date dt;
}

/*
Date dt;
^
  both class java.util.Date in java.util and class java.sql.Date in java.sql match

ERROR:-
-------------

Date naam ki class dono SQL, Util package mai h.
Toh Compiler ke samney Ambiguity aajayegi kuki Class DATE ke saath konsa package use krna hai . Compiler confuse ho jayega ...... isse error dedega.


SOLUTION:-
-----------------
ab yeah duty hai programmer ki : Date class ke saath konsa package use karna hai.
*/