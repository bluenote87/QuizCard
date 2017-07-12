public class QuizCard {
		
		public QuizCard(String q, String a) { //no return type here because constructors don't have them!
			question = q;
			answer = a;
		}
		
		private String question;
		private String answer;
		
		public String getQuestion() {
			return question;
		}
		
		public String getAnswer() {
			return answer;
		}
	}
