package complex_lab.forgery;

import java.util.ArrayList;
import java.util.List;

import complex_lab.commands.FindCommand;
import complex_lab.commands.SortCommand;
import complex_lab.equipment.Equipment;

public class ForgeMaster {
    List<Equipment> eq;
    
    Knight knight;
    double eqPrice = 0;

    SortCommand sortCommand;
    FindCommand findCommand;

    public ForgeMaster(List<Equipment> equipment) {this.eq = equipment;}

    public boolean checkAffiliation(Equipment eqp) {
        String knightAffiliation = knight.getAffiliation();
        return knightAffiliation.equals(eqp.getPieceAffiliation()); 
    }

    public boolean duplicateTypesPresent(Equipment eqp) {
        String targetType = eqp.getPieceType();
        for (Equipment equipment : eq) {
            String pieceType = equipment.getPieceType();
            if (pieceType.equals(targetType)) {
                return true;
            }
        }
        return false;
    }

    public void createKnight(String knightType) {this.knight = new Knight(knightType);}

    public void setSortCommand(SortCommand newSortCommand) {this.sortCommand = newSortCommand;}
    public void setFindCommand(FindCommand newFindCommand) {this.findCommand = newFindCommand;}

    public List<Equipment> executeSort() {return this.sortCommand.execute();}
    public List<Equipment> executeFind() {return this.findCommand.execute();}

    public List<Equipment> getAvailableEquipment() {return this.eq;}
    public double getTotalPrice() {return this.eqPrice;}

    public void addEquipment(Equipment eqp) {
        if (checkAffiliation(eqp)) {
            if (!duplicateTypesPresent(eqp)) {
                List<Equipment> currEq = knight.getCurrEquipment();
                currEq.add(eqp);
                knight.setNewEquipment(currEq);
            }
        } else {
            System.out.println("Impossible to add equipment piece: affiliation not supported.");
        }
        calculateEquipmentPrice();
    }

    public void removeEquipment(Equipment eqp) {
        List<Equipment> newEq = new ArrayList<>();
        for (Equipment equipment : eq) {
            if (!equipment.equals(eqp)) {
                newEq.add(equipment);
            }
        }
        calculateEquipmentPrice();
    }

    public void calculateEquipmentPrice() {
        double newTotalPrice = 0;
        for (Equipment equipment : eq) {
            newTotalPrice += equipment.getPiecePrice();
        }
        this.eqPrice = newTotalPrice;
    }
}
