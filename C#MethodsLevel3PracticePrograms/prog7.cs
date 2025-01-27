using System;

class OTPGenerator
{
    public static bool areaQotp(int[] otp)
    {
        for (int i = 0; i < otp.Length; i++)
        {
            for (int j = i + 1; j < otp.Length; j++)
            {
                if (otp[i] == otp[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static int GenerateOTP()
    {
        Random randomNumber = new Random();
        return randomNumber.Next(100000, 1000000);
    }


    public static void Main()
    {
        int[] otp = new int[10];

        for (int i = 0; i < 10; i++)
        {
            otp[i] = GenerateOTP();
            Console.WriteLine("Generated OTP: " + otp[i]);
        }

        bool Unique = areaotp(otp);

        if (Unique)
        {
            Console.WriteLine("All OTPs are Unique.");
        }
        else
        {
            Console.WriteLine("Some OTPs are not Unique.");
        }
    }
}

