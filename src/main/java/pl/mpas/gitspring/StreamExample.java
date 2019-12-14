package pl.mpas.gitspring;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamExample {
private static final Logger log= LoggerFactory.getLogger(StreamExample.class);
    public static void main(String[] args){
        List<String> colors = Arrays.asList(
             "white",
             "black",
             "red",
             "blue",
             "pink"

        );

        //TODO
                //wyrzuc kolory z min 4 zn
                //zmien stringi na liczbe znakow
                //zbierz to do listy
        colors.stream()
                .filter(s -> {
                    boolean test=s.length() >=4;
                    log.info("testing object[{}]- passed? [{}]", s, test);
                    return test ;})
                .map(s -> {
                    log.info("mapping object [{}]", s);
               return s.length();})
               .collect(Collectors.toList()) //
          ;  //    .forEach(integer -> System.out.println("number: "+integer));

        }
    }

