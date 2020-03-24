abstract class GeneralBank
{
	abstract void getFixedDepositInterestRate();
	abstract void getSavingsInterestRate();
}

class ICICIBank extends GeneralBank
{
	void getSavingsInterestRate()
	{
		System.out.println("Interest rate of savings account in ICICI Bank is 4%");
	}

	void getFixedDepositInterestRate()
	{
		System.out.println("Interest rate of fixed deposit account in ICICI Bank is 8.5%");
	}
}

class KotMBank extends GeneralBank
{
	void getSavingsInterestRate()
	{
		System.out.println("Interest rate of savings account in KotM Bank is 6%");
	}

	void getFixedDepositInterestRate()
	{
		System.out.println("Interest rate of fixed getFixedDepositInterestRate account in KotakM Bank is 9%");
	}
}


class HoA1
{
	public static void main(String[] args)
	{
		ICICIBank i = new ICICIBank();
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();

		KotMBank k = new KotMBank();
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();

		GeneralBank g; 
		g = new KotMBank();
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();

		g = new ICICIBank();
		g.getSavingsInterestRate();
		g.getFixedDepositInterestRate();
	}
}

