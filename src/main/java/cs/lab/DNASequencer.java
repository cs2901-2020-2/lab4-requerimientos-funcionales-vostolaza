package cs.lab;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Scanner;


public class  DNASequencer {

    static final Logger logger = Logger.getLogger(DNASequencer.class.getName());
    public DNASequencer() {
        logger.info("Starting sequencer...");
    }

    public static String inputSequence(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }


    public static String calculate(List<String> part){
        List<String> sequence = new ArrayList<String>();

        for (String sub : part){
            logger.info(sub);
        }

        return "AGATTACAGA";
    }



    public static void main(String[] args){
        List<String> subseq = new ArrayList<String>();
        for (int i = 0; i < 3; i++){
            String str = inputSequence();
            subseq.add(str);
        }

        calculate(subseq);
    }
}
