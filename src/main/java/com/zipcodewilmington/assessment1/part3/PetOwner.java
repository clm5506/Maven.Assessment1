package com.zipcodewilmington.assessment1.part3;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */

    String name;
    List<Pet> arrayOfPets;

    public PetOwner(String name, Pet... pets) {

        this.name = name;
        if(pets != null) {
            this.arrayOfPets = new ArrayList<Pet>();
            this.arrayOfPets.addAll(Arrays.asList(pets));
            for(Pet p : arrayOfPets){
                p.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        arrayOfPets = new ArrayList<>();
        arrayOfPets.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        if(arrayOfPets.contains(pet)){
            arrayOfPets.remove(pet);
        }
        if (arrayOfPets.size() == 0) {
            arrayOfPets.add(null);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(pet.getOwner() == this){
            return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {

        Pet[] pets = getPets();
        int age = pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
                if(pets[i].getAge() < age){
                    age = pets[i].getAge();
                }
        }
        return age;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet[] pets = getPets();
        int age = pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
            if(pets[i].getAge() > age){
                age = pets[i].getAge();
            }
        }
        return age;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Pet[] pets = getPets();
        float sum = 0;
        for(int i = 0; i < pets.length; i++){
            sum += pets[i].getAge();
        }

        return (sum/getNumberOfPets());
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return (Integer) arrayOfPets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(arrayOfPets.size() > 0) {
            Pet[] pet = arrayOfPets.toArray(new Pet[0]);
            return pet;
        } else return null;
    }
}
