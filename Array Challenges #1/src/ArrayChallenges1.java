public class ArrayChallenges1
	{
	public static void main(String[] args)
		{
		String[] list =
			{ "Hello", "hi", "sup", "how are you", "whats up" };
		System.out.println(list[2]);

		int[] numbers =
			{ 1, 2, 3, 0 };
		System.out.println(numbers[3]);

		for (int i = 0; i <= 3; i++)
			{
			System.out.println(numbers[i]);
			}

		System.out
				.println((numbers[0] + numbers[1] + numbers[2] + numbers[3]) / 4);
		}
	}
