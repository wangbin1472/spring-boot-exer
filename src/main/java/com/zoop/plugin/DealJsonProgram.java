package com.zoop.plugin;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.zoop.bean.Person;

import java.io.IOException;

//@JsonComponent
public class DealJsonProgram {


    public static class PersonSerializer extends JsonSerializer<Person> {


        @Override
        public void serialize(Person person, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {


            System.out.println(person + "==============================");
            //   jsonGenerator.writeObject(person);

        }
    }
}
