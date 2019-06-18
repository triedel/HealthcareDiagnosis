import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				String medicine = "1";
				String a = "A";
				String b = "B";
				String c = "C";
				String d = "D";
				String yes = "yes";
				String no = "no";
				int trueA;
				int trueB;
				int trueC;
				int trueD;
				System.out.println("Good Day! How may we help you?");
				System.out.println("What is your gender?");
				System.out.println("A: Male");
				System.out.println("B: Female");
				System.out.println("Type in Letter");
				String gender = scanner.next();
				medicine = medicine + gender;
				trueA = gender.compareToIgnoreCase(a);
				trueB = gender.compareToIgnoreCase(b);
				trueC = gender.compareToIgnoreCase(c);
					
				if (trueA==0){
					System.out.println("Great! Next Step:");
					System.out.println("What is your age?");
					String age = scanner.next();
					int realage = Integer.parseInt(age);
					
					if (realage<=12){
						System.out.println("Good Job. If you are confused for the next couple steps, bring a Parent or Guardian.");
						System.out.println("Are your symptoms:");
						System.out.println("A: Basic");
						System.out.println("B: Medium");
						System.out.println("C: Major");
						System.out.println("D: Don't Know");
						String severity = scanner.next();
						medicine = medicine + a;
						trueA = severity.compareToIgnoreCase(a);
						trueB = severity.compareToIgnoreCase(b);
						trueC = severity.compareToIgnoreCase(c);
						trueD = severity.compareToIgnoreCase(d);
						
						if (trueA==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";							
							}
						
						if (trueB==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";
						}
						
						if(trueC==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}
							
						if(trueD==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}	
					}
					if (realage>12){
						System.out.println("Good Job.");
						System.out.println("Are your symptoms:");
						System.out.println("A: Basic");
						System.out.println("B: Medium");
						System.out.println("C: Major");
						System.out.println("D: Don't Know");
						String severity = scanner.next();
						medicine = medicine + a;
						trueA = severity.compareToIgnoreCase(a);
						trueB = severity.compareToIgnoreCase(b);
						trueC = severity.compareToIgnoreCase(c);
						trueD = severity.compareToIgnoreCase(d);
						
						if (trueA==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";							
							}
						
						if (trueB==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";
						}
						
						if(trueC==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}
							
						if(trueD==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}	
					}
				}
				if (trueB==0){
					System.out.println("Great! Next Step:");
					System.out.println("What is your age?");
					String age = scanner.next();
					int realage = Integer.parseInt(age);
					
					if (realage<=12){
						System.out.println("Good Job. If you are confused for the next couple steps, bring a Parent or Guardian.");
						System.out.println("Are your symptoms:");
						System.out.println("A: Basic");
						System.out.println("B: Medium");
						System.out.println("C: Major");
						System.out.println("D: Don't Know");
						String severity = scanner.next();
						medicine = medicine + a;
						trueA = severity.compareToIgnoreCase(a);
						trueB = severity.compareToIgnoreCase(b);
						trueC = severity.compareToIgnoreCase(c);
						trueD = severity.compareToIgnoreCase(d);
						
						if (trueA==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";							
							}
						
						if (trueB==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";
						}
						
						if(trueC==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}
							
						if(trueD==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}	
					}
					if (realage>12){
						System.out.println("Good Job.");
						System.out.println("Are your symptoms:");
						System.out.println("A: Basic");
						System.out.println("B: Medium");
						System.out.println("C: Major");
						System.out.println("D: Don't Know");
						String severity = scanner.next();
						medicine = medicine + a;
						trueA = severity.compareToIgnoreCase(a);
						trueB = severity.compareToIgnoreCase(b);
						trueC = severity.compareToIgnoreCase(c);
						trueD = severity.compareToIgnoreCase(d);
						
						if (trueA==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";							
							}
						
						if (trueB==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";
						}
						
						if(trueC==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}
							
						if(trueD==0){
							System.out.println("Interesting...");
							System.out.println("Are you coughing, yes or no?");
							String coughing = scanner.next();
							medicine = medicine + coughing + "cgh";
							System.out.println("Oh no...");
							System.out.println("Are you sneezing, yes or no?");
							String sneezing = scanner.next();
							medicine = medicine + sneezing + "snz";
							System.out.println("Hm...");
							System.out.println("Do you have a fever, yes or no?");
							String fever = scanner.next();
							medicine = medicine + fever + "fvr";
							System.out.println("Man...");
							System.out.println("Do you have congestion, yes or no?");
							String congestion = scanner.next();
							medicine = medicine + congestion + "cng";
							System.out.println("Shoot...");
							System.out.println("Do you have headaches, yes or no?");
							String headache = scanner.next();
							medicine = medicine + headache + "hdc";
							System.out.println("True...");
							System.out.println("Do you have body aches, yes or no?");
							String bodyache = scanner.next();
							medicine = medicine + bodyache + "bdc";
							System.out.println("Bummer...");
							System.out.println("Do you have waterey eyes, yes or no?");
							String watereyeyes = scanner.next();
							medicine = medicine + watereyeyes + "wre";		
						}	
					}
				}
				
				System.out.println("Your Diagnosis is...");
			}

	}