import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> tranSeq = new ArrayList<String>();
        String codon;
        int codonLength = 3;

        for(int i = 0; i < rnaSequence.length(); i += codonLength) {

            codon = rnaSequence.substring(i, i + 3);    //break string into substrings of codon length

            if(codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) { //end translation when encountering terminating codons
                break;
            }

            switch(codon) {
                case "AUG":
                    tranSeq.add("Methionine");
                    break;
                case "UUU":
                    tranSeq.add("Phenylalanine");
                    break;
                case "UUC":
                    tranSeq.add("Phenylalanine");
                    break;
                case "UUA":
                    tranSeq.add("Leucine");
                    break;
                case "UUG":
                    tranSeq.add("Leucine");
                    break;
                case "UCU":
                    tranSeq.add("Serine");
                    break;
                case "UCC":
                    tranSeq.add("Serine");
                    break;
                case "UCA":
                    tranSeq.add("Serine");
                    break;
                case "UCG":
                    tranSeq.add("Serine");
                    break;
                case "UAU":
                    tranSeq.add("Tyrosine");
                    break;
                case "UAC":
                    tranSeq.add("Tyrosine");
                    break;
                case "UGU":
                    tranSeq.add("Cysteine");
                    break;
                case "UGC":
                    tranSeq.add("Cysteine");
                    break;
                case "UGG":
                    tranSeq.add("Tryptophan");
                    break;
            }
        }
        return tranSeq;
    }
}