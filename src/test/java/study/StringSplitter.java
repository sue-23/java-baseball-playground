package study;

import org.graalvm.compiler.serviceprovider.IsolateUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitter {

    //1. input 을 " " 기준으로 쪼개기
    String[] split_input(String input) {
        String[] inputs = input.split(" ");
        return inputs;
    }


}


