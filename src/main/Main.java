/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import client.Client;
import view.factory.PersonViewFactory;
import view.factory.impl.AdvancedPersonViewFactory;

/**
 *
 * @author student1
 */
public class Main {

    public static void main(String[] args) {
        Client client;
        PersonViewFactory personViewFactory = new AdvancedPersonViewFactory();
        client = new Client(personViewFactory);
        client.create();
    }
}
