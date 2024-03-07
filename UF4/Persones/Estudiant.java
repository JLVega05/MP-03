package UF4.Persones;

public class Estudiant extends Persona {
    private String curs;
    private String assignatures;
    private String escola;
    private int notes;

    

    public Estudiant(String id, int edad, String nom, String curs, String assignatures, String escola, int notes) {
        super(id, edad, nom);
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }
    public String getCurs() {
        return curs;
    }
    public void setCurs(String curs) {
        this.curs = curs;
    }
    public String getAssignatures() {
        return assignatures;
    }
    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }
    public String getEscola() {
        return escola;
    }
    public void setEscola(String escola) {
        this.escola = escola;
    }
    public int getNotes() {
        return notes;
    }
    public void setNotes(int notes) {
        this.notes = notes;
    }
    
    
}
