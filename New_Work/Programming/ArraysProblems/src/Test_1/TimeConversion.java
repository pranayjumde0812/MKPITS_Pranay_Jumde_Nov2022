package Test_1;

public class TimeConversion {
    // JAVA PROGRAM TO CONVERT 12 HOUR
// FORMAT TO 24 HOUR FORMAT
        static void print24(String str)
        {
            // Get HOURS
            int h1 = (int)str.charAt(1) - '0';
            int h2 = (int)str.charAt(0) - '0';
            System.out.println(h1+" "+h2);
            int hh = (h2 * 10 + h1 % 10);
            System.out.println(hh);

            // If time is in "AM"
            if (str.charAt(8) == 'A')
            {
                if (hh == 12)
                {
                    System.out.print("00");
                    for (int i = 2; i <= 7; i++)
                        System.out.print(str.charAt(i));
                }
                else
                {
                    for (int i = 0; i <= 7; i++)
                        System.out.print(str.charAt(i));
                }
            }

            // If time is in "PM"
            else
            {
                if (hh == 12)
                {
                    System.out.print("12");
                    for (int i = 2; i <= 7; i++)
                        System.out.print(str.charAt(i));
                }
                else
                {
                    hh = hh + 12;
                    System.out.print(hh);
                    for (int i = 2; i <= 7; i++)
                        System.out.print(str.charAt(i));
                }
            }
        }

        // Driver code
        public static void main (String[] args)
        {
            String str = "01:05:4AM";
            print24(str);
        }
    }



