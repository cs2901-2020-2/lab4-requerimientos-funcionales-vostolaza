package cs.lab;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;


public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public static String calculate(List<String> part){
        List<Character> sequence = new ArrayList<Character>();
        for (String sub : part){
            Boolean sequenceFound = false;
            if (sequence.isEmpty()){
                for (int i = 0; i < sub.length(); i++){
                    sequence.add(sub.charAt(i));
                }
            }
            else{
                for (int i = 0; i < sequence.size(); i++){
                    if (sequence.get(i) == sub.charAt(0)){
                        sequenceFound = true;
                        for (int j = i; j < sequence.size(); j++){
                            if (sequence.get(j) != sub.charAt(j-i)){
                                sequenceFound = false;
                            }
                            if (!sequenceFound){break;}
                        }
                    }
                    if (sequenceFound){
                        for (int k = sequence.size()-i; k < sub.length(); k++){
                            sequence.add(sub.charAt(k));
                        }
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
		for (Character ch: sequence) {
			sb.append(ch);
		}

        return sb.toString();
    }
}
