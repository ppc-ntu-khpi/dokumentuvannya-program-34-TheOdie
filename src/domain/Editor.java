package domain;
/** Містить реалізацію методів
 * 
 * @author User
 */
public class Editor extends Artist {
    /** Ініціалізує
     * 
     * @param electronicEditing
     * @param skiils
     * @param name
     * @param jobTitle
     * @param level
     * @param dept 
     */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/** Ініціалізує
 * 
 * @param electronicEditing
 * @param skiils 
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/** Ініціалізує
 * 
 * @param electronicEditing 
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
  /** Ініціалізує 
   * 
   */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
/** Виводить значення
 * 
 * @return s
 */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
/** Отримати налаштування
 * 
 * @return 
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/** Встановити налаштування
 * 
 * @param electronic 
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
