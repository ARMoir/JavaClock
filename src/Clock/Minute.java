package Clock;

public class Minute 
{
	public static void SetMinute()
    {
        if (Program.Clock.Minutes >= 55)
        {
        	M11();
        }
        else if (Program.Clock.Minutes >= 50)
        {
        	M10();	
        }
        else if (Program.Clock.Minutes >= 45)
        {
        	M9();	
        }
        else if (Program.Clock.Minutes >= 40)
        {
        	M8();	
        }
        else if (Program.Clock.Minutes >= 35)
        {
        	M7();	
        }
        else if (Program.Clock.Minutes >= 30)
        {
        	M6();	
        }
        else if (Program.Clock.Minutes >= 25)
        {
        	M5();	
        }
        else if (Program.Clock.Minutes >= 20)
        {
        	M4();	
        }
        else if (Program.Clock.Minutes >= 15)
        {
        	M3();	
        }
        else if (Program.Clock.Minutes >= 10)
        {
        	M2();	
        }
        else if (Program.Clock.Minutes >= 5)
        {
        	M1();	
        }
        else if (Program.Clock.Minutes >= 0)
        {
        	M12();	
        }
    }

    public static void M1()
    {
        Program.Clock.ClockChar.set(60, "M"); //[60] = @"M"; 
        Program.Clock.ClockChar.set(82, "/");//[82] = @"/"; 
        Program.Clock.ClockChar.set(104, "/");//[104] = @"/"; 
    }

    public static void M2()
    {
        Program.Clock.ClockChar.set(85, "M");//[85] = @"M"; 
        Program.Clock.ClockChar.set(107, "/");//[107] = @"/"; 
        Program.Clock.ClockChar.set(138, "/");//[128] = @"/"; 

    }
    
    public static void M3()
    {
        Program.Clock.ClockChar.set(154, "M");//[154] = @"M"; 
        Program.Clock.ClockChar.set(153, "-");//[153] = @"-"; 
        Program.Clock.ClockChar.set(152, "-");//[152] = @"-"; 
        Program.Clock.ClockChar.set(151, "-");//[151] = @"-"; 
    }
    
    public static void M4()
    {
        Program.Clock.ClockChar.set(223, "M");//[223] = @"M"; 
        Program.Clock.ClockChar.set(199, "\\");//[199] = @"\"; 
        Program.Clock.ClockChar.set(174, "\\");//[174] = @"\"; 
    }

    public static void M5()
    {

        Program.Clock.ClockChar.set(244, "M");//[244] = @"M"; 
        Program.Clock.ClockChar.set(220, "\\");//[220] = @"\"; 
        Program.Clock.ClockChar.set(196, "\\");//[196] = @"\"; 
    }
    public static void M6()
    {
        Program.Clock.ClockChar.set(240, "M");//[240] = @"M";
        Program.Clock.ClockChar.set(217, "|");//[217] = @"|"; 
        Program.Clock.ClockChar.set(194, "|");//[194] = @"|"; 
    }

    public static void M7()
    {
        Program.Clock.ClockChar.set(236, "M");//[236] = @"M"; 
        Program.Clock.ClockChar.set(214, "/");//[214] = @"/"; 
        Program.Clock.ClockChar.set(192, "/");//[192] = @"/"; 
    }

    public static void M8()
    {
        Program.Clock.ClockChar.set(211, "M");//[211] = @"M"; 
        Program.Clock.ClockChar.set(189, "/");//[189] = @"/"; 
        Program.Clock.ClockChar.set(168, "/");//[168] = @"/"; 
    }

    public static void M9()
    {
        Program.Clock.ClockChar.set(142, "M");//[142] = @"M"; 
        Program.Clock.ClockChar.set(142, "-");//[143] = @"-"; 
        Program.Clock.ClockChar.set(144, "-");//[144] = @"-"; 
        Program.Clock.ClockChar.set(145, "-");//[145] = @"-"; 
    }

    public static void M10()
    {

        Program.Clock.ClockChar.set(73, "M");//[73] = @"M"; 
        Program.Clock.ClockChar.set(97, "\\");//[97] = @"\"; 
        Program.Clock.ClockChar.set(122, "\\");//[122] = @"\"; 
    }

    public static void M11()
    {
        Program.Clock.ClockChar.set(52, "M");//[52] = @"M";
        Program.Clock.ClockChar.set(76, "\\");//[76] = @"\"; 
        Program.Clock.ClockChar.set(100, "\\");//[100] = @"\"; 
    }

    public static void M12()
    {
        Program.Clock.ClockChar.set(56, "M");//[56] = @"M"; 
        Program.Clock.ClockChar.set(79, "|");//[79] = @"|"; 
        Program.Clock.ClockChar.set(102, "|");//[102] = @"|"; 
    }

}
