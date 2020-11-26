// import java.io.File;
// import edu.duke.*;

package week2;

public class FindGeneSimpleAndTest {
	public static String findGeneSimple(String dna)
	{
		// start codon is "ATG"
		// stop codon in "TAA"
		String result = "";
		
		int startIndex = dna.indexOf("ATG");
		if (startIndex == -1) // no ATG
		{
			return "";
		}
		
		int stopIndex = dna.indexOf("TAA", startIndex + 3);
		if (stopIndex == -1)  // no TAA
		{
			return "";
		}
		
		result = dna.substring(startIndex, stopIndex + 3);
		
		return result;
	}

	public static void testFindGeneSimple()
	{
		String dna = "AAATGCCCTAACTAGATTAAGAAACC";
		System.out.println("DNA string is " + dna);
		String gene = findGeneSimple(dna);
		System.out.println("Gene is " + gene);
		
		dna = "AATGCTAGGGTAATATGGT";
		System.out.println("DNA string is " + dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is " + gene);

		dna = "ATCCTATGCTTCGGCTGCTCTAATATGGT";
		System.out.println("DNA string is " + dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is " + gene);

		dna = "ATGTAA";
		dna = "TAATAA";
		System.out.println("DNA string is " + dna);
		gene = findGeneSimple(dna);
		System.out.println("Gene is " + gene);
	}
	
	
   public static void main(String[] args)
   {
	   testFindGeneSimple();
	   System.out.println("**DONE**");
   }
	
}
