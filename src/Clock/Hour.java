package Clock;

public class Hour 
{
	public static void SetHour()
    {
        if(Program.Clock.Hours > 12)
        {
            Program.Clock.Hours -= 12;
        }
        else if (Program.Clock.Hours == 0)
        {
        	Program.Clock.Hours = 12;
        }

        switch (Program.Clock.Hours)
        {
            case 1:
                H1();
                break;

            case 2:
                H2();
                break;

            case 3:
                H3();
                break;

            case 4:
                H4();
                break;

            case 5:
                H5();
                break;

            case 6:
                H6();
                break;

            case 7:
                H7();
                break;

            case 8:
                H8();
                break;

            case 9:
                H9();
                break;

            case 10:
                H10();
                break;

            case 11:
                H11();
                break;

            case 12:
                H12();
                break;
        }
    }

    public static void H1()
    {
        Program.Clock.ClockChar.set(82, "H"); 
        Program.Clock.ClockChar.set(104, "/");
    }

    public static void H2()
    {
        Program.Clock.ClockChar.set(107, "H");
        Program.Clock.ClockChar.set(128, "/"); //[128] = @"/"; 
    }
    public static void H3()
    {
        Program.Clock.ClockChar.set(153, "H"); //[153] = @"H"; 
        Program.Clock.ClockChar.set(152, "-"); //[152] = @"-"; 
        Program.Clock.ClockChar.set(151, "-"); //[151] = @"-";     
    }

    public static void H4()
    {
        Program.Clock.ClockChar.set(199, "H"); //[199] = @"H"; 
        Program.Clock.ClockChar.set(174, "\\"); //[174] = @"\"; 
    }

    public static void H5()
    {

        Program.Clock.ClockChar.set(220, "H"); //[220] = @"H"; 
        Program.Clock.ClockChar.set(196, "\\"); //[196] = @"\"; 
    }

    public static void H6()
    {
        Program.Clock.ClockChar.set(217, "H"); //[217] = @"H"; 
        Program.Clock.ClockChar.set(194, "|"); //[194] = @"|"; 
    }

    public static void H7()
    {
        Program.Clock.ClockChar.set(214, "H"); //[214] = @"H"; 
        Program.Clock.ClockChar.set(82, "\\"); //[192] = @"/"; 
    }

    public static void H8()
    {
        Program.Clock.ClockChar.set(189, "H"); //[189] = @"H"; 
        Program.Clock.ClockChar.set(168, "/"); //[168] = @"/"; 
    }

    public static void H9()
    {
        Program.Clock.ClockChar.set(143, "H"); //[143] = @"H"; 
        Program.Clock.ClockChar.set(144, "-"); //[144] = @"-"; 
        Program.Clock.ClockChar.set(145, "-"); //[145] = @"-"; 
    }

    public static void H10()
    {
        Program.Clock.ClockChar.set(97, "H"); //[97] = @"H"; 
        Program.Clock.ClockChar.set(122, "\\"); //[122] = @"\"; 
    }

    public static void H11()
    {
        Program.Clock.ClockChar.set(76, "H"); //[76] = @"H"; 
        Program.Clock.ClockChar.set(100, "\\"); //[100] = @"\"; 
    }

    public static void H12()
    {
        Program.Clock.ClockChar.set(79, "H"); //[79] = @"H"; 
        Program.Clock.ClockChar.set(102, "|"); //[102] = @"|"; 
    }
}


