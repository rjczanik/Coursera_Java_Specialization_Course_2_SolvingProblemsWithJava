package week2;

import edu.duke.*;

public class StorageResourceExample {
	public StorageResource getAllGenes(String dna) {
		StorageResource geneList = new StorageResource();
		
		int startIndex = 0;
		
		while(true) {
			String currentGene = findGene(dna, startIndex);
			
			if(currentGene.isEmpty()) {
				break;
			}
			
			geneList.add(currentGene);
			
			startIndex = dna.indexOf(currentGene, startIndex);
					     currentGene.length();
		}
		
		return geneList;
	}
	
	public void testOn(String dna) {
		System.out.println("Testing getAllGenes on: " + dna);
		StorageResource genes = getAllGenes(dna);
		for (String g: genes.data()) {
			System.out.println(g);
		}
	}
	

}
