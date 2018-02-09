
/**
 * Created by dengyiran on 18/2/9.
 */

package com.example.dengyiran.myapplication;

public class password_validator{

                public int checklength(String password) {
                    if (password.length() > 7)
                        return 0;
                    else
                        return 100;
                }
                public int checkequal(String password) {
                    if (!password.equals("password"))
                        return 1;
                    else
                        return 101;
                }
                public int checkdigits(String password) {
                    if (password.matches("[0-9]+"))
                        return 2;
                    else
                        return 102;
                }
                public int checklower(String password) {
                    if (password.matches("[0-9a-z]+"))
                        return 3;
                    else
                        return 103;
                }
                public int checkupper(String password) {
                    if(password.matches("[0-9a-zA-Z]+"))
                        return 4;
                    else
                        return 104;
                }
}
