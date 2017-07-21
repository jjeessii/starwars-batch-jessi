package com.starwars.batch.processor;

import com.starwars.batch.domain.People;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Jessica on 21/07/2017.
 */
public class PeopleProcessor implements ItemProcessor<People,People> {

    public static final String NA_GENDER = "n/a";
    public static final String DROID_GENDER = "droid";

    @Override
    public People process(People people) throws Exception {
        if(NA_GENDER.equalsIgnoreCase(people.getGender())) {
            people.setGender(DROID_GENDER);
        }
        return people;
    }
}
