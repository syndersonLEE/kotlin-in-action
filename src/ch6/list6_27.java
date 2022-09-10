package ch6;

import java.util.List;

public class list6_27 {
    interface DataParser<T> {
        void parseData(String input, List<T> output, List<String> errors);
    }
}
