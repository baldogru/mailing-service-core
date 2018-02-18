package org.baldogru.mailingservice.core.dto;


import lombok.*;
import org.baldogru.mailingservice.core.annotations.Immutable;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Klasa zawierająca szczegóły załącznika mailowego.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true) //konsutruktor miał być o zasięgu pakietowym, nie protected :)
                                                                //Oprócz tego to miał być AllArgsConstructor, bo musi gdzies
                                                                //zainicjalizować dane tej klasy (pola są final)
                                                                //force = true jest tu niepotrzebne. Nie używamy setterów
                                                                //Bo klasa ma być Immutable
@Builder //Builder powinien być fizyczną, oddzielną klasą. W intelliJ jest opcja Refactor -> Replace constructor with Builder
        //Trzeba tego użyć i potem zrefaktorować nazwę metody budującej na build() bo intelliJ domyślnie robi metodę createXXX
        //co sugeruje, że to fabryka a nie builder. Czyli ta adnotacja @Builder do usunięcia
@Getter
@Immutable //Dodałem adnotację @Immutable - będzie ona sugerować, że klasa ma być projektowana jako niemodyfikowalna
            //może w przyszłości uda się ją rozbudować, żeby kompilator podpowiedzi dawał kiedy ta adnotacja jest użyta
public final class MailAttachment {
    private final Long id;
    private final String name;
    private final String extension;
    //żeby było wiadomo w jakiej jednostce jest zwracana wielkość pliku, zrefaktorujemy nazwę do sizeInBytes - jeżeli
    // builder był wygenerowany wcześniej to trzeba tam też zrefaktorować
    private final Long size;
    //po namyśle zrefaktorujmy to do creationDate - jeżeli builder był wygenerowany wcześniej to trzeba pamiętać
    //żeby w builderze też zrefaktorować
    private final LocalDateTime createDate;
    private final File attachmentFile;

}
