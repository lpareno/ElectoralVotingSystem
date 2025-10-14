package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

// extends allow for window to run by itself
public class AboutWindow extends JFrame {
	static class Member {
		String name, role, photo;
		List<String> education, professional, technical, awards, experience; // lists for bio
		
		// method for members
		Member(String name, String role, String photo, List<String> education, List<String> professional, List<String> technical, List<String> awards, List<String> experience) {
			// this assigns variables for this function to its own variable
			this.name = name; 
			this.role = role;
			this.photo = photo;
			this.education = education;
			this.professional = professional;
			this.technical = technical;
			this.awards = awards;
			this.experience = experience;
		}
	}
	
	private static final List<Member> Team = Arrays.asList(
			
			new Member ("Billy Aranda", "Quality Assurance","assets/billy.jpg", Arrays.asList("AS In Comp Sci", "AST In Mathematics", "AS In Physical Science & Mathematics"), Arrays.asList("1 Year of Leadership", "Documentation", "Testing" ), Arrays.asList("Python", "C++", "Java"), Arrays.asList("Valedictorian", "2x Greater Raider Recipient", "Multi-Time Captain"), Arrays.asList("No Relevant Experience"))
			
	);
			
	public AboutWindow() {
		super("About Us"); // calls the parent class of the method since it extends JFrame its essentially creating a new JFrame calling it About Us
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // keeps it running in the background when closed apparently useful for multiwindow apps
		setSize(820, 680); // resolution of the window
		setLocationRelativeTo(null); // centers the window on screen NOT NEEDED BUT QOL
		JPanel root = new JPanel (new BorderLayout()); // components put into panels to display things
													   // border layout is a layout manager that splits the area into 5 regions NORTH SOUTH EAST WEST AND CENTER
		setContentPane(root); // use my panel as the main body of the window
		root.add(buildHeader(), BorderLayout.NORTH);
		
	}
	
	private JComponent buildHeader() {
		JPanel p = new JPanel(new BorderLayout()); // make a box to hold my header
		p.setBorder(new CompoundBorder(
				new MatteBorder(0,0,1,0, new Color(220, 220, 220)), 
				new EmptyBorder(12,12,12,12)
		));
		
		JLabel title = new JLabel("About Us");
		title.setHorizontalAlignment(SwingConstants.CENTER);
	    p.add(title, BorderLayout.CENTER);
	    
	    return p;
	}
	
	// USE TO TEST THIS SPECIFIC FILE

	/*public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AboutWindow().setVisible(true));
    }
    */
}
