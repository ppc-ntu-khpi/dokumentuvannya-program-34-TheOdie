package domain;
/** Містить реалізацію методів
 * 
 * @author User
 */
public class Artist extends Employee {
    /** Ініціалізує
     * @param skiils.
     * @param name
     * @param jobTitle
     * @param level
     * @param dept*/
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/** Ініціалізує
     * @param skiils.*/
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /** Ініціалізує
     * 
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
/** Вивід значень
     * @return String*/
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;

    /** Отримати значення
     * @return skiils.*/
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/** Встановить нові навикички
 * 
 * @param skills 
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/** Отримання листа з навичками
 * 
 * @return skills
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
