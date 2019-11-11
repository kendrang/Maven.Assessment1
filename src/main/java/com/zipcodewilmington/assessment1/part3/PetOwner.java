package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    String name = "";
    Pet[] pets;
    Pet pet ;

    public PetOwner(String name, Pet... pets) {
    this.name = name;
    this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
    for (int i =0 ; i < pets.length ; i++){
        if (pets[i] == pet){
            pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i =0 ; i < pets.length ; i++){
            if (pets[i] == pet){
                return true;
            }
        }return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = pets[0].getAge();
        for (Pet petAges : pets) {
            if (petAges.getAge() < youngest) {
                youngest = petAges.getAge();
            }
        }
        return youngest;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = pets[0].getAge();
        for (Pet petAges : pets) {
            if (petAges.getAge() > oldest) {
                oldest = petAges.getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float averageAge = 0F;
        for (Pet petAges : pets ) {
           averageAge +=  petAges.getAge() ;

        } return averageAge / pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
