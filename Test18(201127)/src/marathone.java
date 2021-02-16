
public class marathone {

	public static void main(String[] args) {
		marathone();

	}
	
	public static void marathone() {
		String[] participant = {"leo" , "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		
		int idx = -1;
		for(int i = 0; i < participant.length; i++)
		{
			boolean found = false;
			for(int j = 0; j < completion.length; j++)
			{
				if(participant[i].equals(completion[j]))
				{
					completion[j] = ""; //동명이인을 고려함
					found = true;
					break;
				}
			}
			
			if(found == false)
			{
				idx = i;
				break;
			}
		}
		
		String answer = participant[idx];
		
		System.out.print(participant[idx]);
		
		
	}

}
