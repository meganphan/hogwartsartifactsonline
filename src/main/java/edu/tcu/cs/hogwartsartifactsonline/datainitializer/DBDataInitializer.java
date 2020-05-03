package edu.tcu.cs.hogwartsartifactsonline.datainitializer;

import edu.tcu.cs.hogwartsartifactsonline.dao.ArtifactDao;
//import edu.tcu.cs.hogwartsartifactsonline.dao.UserDao;
//import edu.tcu.cs.hogwartsartifactsonline.dao.WizardDao;
import edu.tcu.cs.hogwartsartifactsonline.domain.Artifact;
//import edu.tcu.cs.hogwartsartifactsonline.domain.User;
//import edu.tcu.cs.hogwartsartifactsonline.domain.Wizard;
//import edu.tcu.cs.hogwartsartifactsonline.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private ArtifactDao artifactDao;
//    private WizardDao wizardDao;
//    private UserService userService;

    public DBDataInitializer(ArtifactDao artifactDao) {
        this.artifactDao = artifactDao;
//        this.wizardDao = wizardDao;
//        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A Deluminator is a device invented by Albus Dumbledore that resembles a cigarette lighter. It is used to remove or absorb (as well as return) the light from any light source to provide cover to the user.");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904193");
        a2.setName("Invisibility Cloak");
        a2.setDescription("An invisibility cloak is used to make the wearer invisible.");
        a2.setImageUrl("imageURL");

        Artifact a3 = new Artifact();
        a3.setId("1250808601744904192");
        a3.setName("Elder Wand");
        a3.setDescription("The Elder Wand, known throughout history as the Deathstick or the Wand of Destiny, is an extremely powerful wand made of elder wood with a core of Thestral tail hair.");
        a3.setImageUrl("imageURL");

        Artifact a4 = new Artifact();
        a4.setId("1250808601744904194");
        a4.setName("The Marauder's Map");
        a4.setDescription("A magical map of Hogwarts created by Remus Lupin, Peter Pettigrew, Sirius Black, and James Potter while they were students at Hogwarts.");
        a4.setImageUrl("imageURL");

        Artifact a5 = new Artifact();
        a5.setId("1250808601744904195");
        a5.setName("The Sword Of Gryffindor");
        a5.setDescription("A goblin-made sword adorned with large rubies on the pommel. It was once owned by Godric Gryffindor, one of the medieval founders of Hogwarts.");
        a5.setImageUrl("imageURL");

        Artifact a6 = new Artifact();
        a6.setId("1250808601744904196");
        a6.setName("Resurrection Stone");
        a6.setDescription("The Resurrection Stone allows the holder to bring back deceased loved ones, in a semi-physical form, and communicate with them.");
        a6.setImageUrl("imageURL");

//        Wizard w1 = new Wizard();
//        w1.setName("Albus Dumbledore");
//        w1.addArtifact(a1);
//        w1.addArtifact(a3);
//
//        Wizard w2 = new Wizard();
//        w2.setName("Harry Potter");
//        w2.addArtifact(a2);
//        w2.addArtifact(a4);
//
//        Wizard w3 = new Wizard();
//        w3.setName("Neville Longbottom");
//        w3.addArtifact(a5);
//
//        wizardDao.save(w1);
//        wizardDao.save(w2);
//        wizardDao.save(w3);
//        // Since a6 doesn't have an owner yet, we need to save it explicitly here
//        artifactDao.save(a6);
//
//        // create some users
//        User u1 = new User();
//        u1.setUsername("john");
//        u1.setPassword("123456");
//        u1.setEnabled(true);
//        u1.setRoles("admin");
//
//        User u2 = new User();
//        u2.setUsername("eric");
//        u2.setPassword("654321");
//        u2.setEnabled(true);
//        u2.setRoles("user");
//
//        User u3 = new User();
//        u3.setUsername("tom");
//        u3.setPassword("qwerty");
//        u3.setEnabled(false);
//        u3.setRoles("user");
//
//        userService.save(u1);
//        userService.save(u2);
//        userService.save(u3);
        artifactDao.save(a1);
        artifactDao.save(a2);
        artifactDao.save(a3);
        artifactDao.save(a4);
        artifactDao.save(a5);
        artifactDao.save(a6);
    }
}
