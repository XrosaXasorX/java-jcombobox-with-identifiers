///////////////////////////////////////////////////////////////////
//
// JESAX.NET [ http://www.jesax.net/ ] 
//  
// JAVA/script Environmental Subroutines for Accessible XML 
//  
// BoF :: "JSX_JAVA_JFRame_IDentifier.java"
// 
// (C) CopyRight JESAX.net / SagoSoft.it [1984 - 2012] 
// 
// Last update: 2012/07/19 - 12:34 
//
///////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////
//
// Imports.
//
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class JSX_JAVA_JFrame_IDentifier extends JFrame
	{
	private static final long              serialVersionUID = 1L;
	private JSX_JAVA_JComboBox_IDentifier  m_jcombobox_identifier ;
	private JButton                        m_jbutton_continue     ;
	private JLabel                         m_jlabel_identifier    ;
	private JLabel                         m_jlabel_index         ;
	private JPanel                         m_jpanel_identifier    ;
	private JSeparator                     m_jseparator_v01       ;
	private JSeparator                     m_jseparator_v02       ;
	private JSeparator                     m_jseparator_v03       ;

	public JSX_JAVA_JFrame_IDentifier( String p_title )
		{

		// Inits.
		super( p_title );
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(500,300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Custom data.
		Object[] itemData_0 = new Object[] { 0, "Please select an Item..."                                            , "zero" };
		Object[] itemData_1 = new Object[] { 1, "The first Item has an IDentifier with Value 1"                       , "1st"  };
		Object[] itemData_2 = new Object[] { 2, "The second Item has an IDentifier like its Position"                 , "2nd"  };
		Object[] itemData_3 = new Object[] { 5, "The third Item switches its IDentifier with the 5th Item"            , "3rd"  };
		Object[] itemData_4 = new Object[] { 4, "The fourth Item has has an IDentifier corresponding to its Position" , "4th"  };
		Object[] itemData_5 = new Object[] { 3, "The fifth Item switches its IDentifier with the 3rd Item"            , "5th"  };

		// Graphics.		
		m_jpanel_identifier = new JPanel();

		// Separators.
		m_jseparator_v01 = new JSeparator( SwingConstants.VERTICAL   ); 
		m_jseparator_v02 = new JSeparator( SwingConstants.VERTICAL   ); 
		m_jseparator_v03 = new JSeparator( SwingConstants.VERTICAL   ); 
		m_jseparator_v01.setSize(500, 10);
		m_jseparator_v02.setSize(500, 10);
		m_jseparator_v03.setSize(500, 10);
		m_jseparator_v01.setPreferredSize(new Dimension(500,10));
		m_jseparator_v02.setPreferredSize(new Dimension(500,10));
		m_jseparator_v03.setPreferredSize(new Dimension(500,10));
		
		// Combos.
		m_jcombobox_identifier = new JSX_JAVA_JComboBox_IDentifier();
		m_jcombobox_identifier.setSize(400, 50);
		m_jcombobox_identifier.setPreferredSize(new Dimension(400,50));
		
		// Custom data.
		m_jcombobox_identifier.addItem( itemData_0 );
		m_jcombobox_identifier.addItem( itemData_1 );
		m_jcombobox_identifier.addItem( itemData_2 );
		m_jcombobox_identifier.addItem( itemData_3 ); 
		m_jcombobox_identifier.addItem( itemData_4 );
		m_jcombobox_identifier.addItem( itemData_5 );
		m_jcombobox_identifier.setSize(400, 50);
		m_jcombobox_identifier.setPreferredSize(new Dimension(400,50));

		// Buttons.
		m_jbutton_continue  = new JButton( "Update..." );
		m_jbutton_continue.setSize(400, 50);
		m_jbutton_continue.setPreferredSize(new Dimension(400,50));
		m_jbutton_continue.setSize( new Dimension(400,50));
		m_jbutton_continue.setAlignmentX(Component.CENTER_ALIGNMENT);

		// Labels.
		m_jlabel_index      = new JLabel( "Index: N/A"      );
		m_jlabel_identifier = new JLabel( "Identifier: N/A" );
		m_jlabel_index.setHorizontalTextPosition(JLabel.LEFT);
		m_jlabel_identifier.setHorizontalTextPosition(JLabel.LEFT);
		m_jlabel_index.setVerticalTextPosition(JLabel.TOP);
		m_jlabel_identifier.setVerticalTextPosition(JLabel.TOP);
		m_jlabel_index.setAlignmentX(Component.LEFT_ALIGNMENT);
		m_jlabel_identifier.setAlignmentX(Component.LEFT_ALIGNMENT);

		// Rendering.
		this.add( m_jpanel_identifier );
		m_jpanel_identifier.add( m_jcombobox_identifier );
		m_jpanel_identifier.add( m_jseparator_v01       );
		m_jpanel_identifier.add( m_jbutton_continue     );
		m_jpanel_identifier.add( m_jseparator_v02       );
		m_jpanel_identifier.add( m_jlabel_index         );
		m_jpanel_identifier.add( m_jseparator_v03       );
		m_jpanel_identifier.add( m_jlabel_identifier    );
			
		// Listeners.
		ActionListener actionlistener_continue = new ActionListener() 
			{
			@Override public void actionPerformed(ActionEvent ev) 
				{
				UpdateIndexAndIdentifier( );
				}//actionPerformed
			};//actionlistener_continue
		m_jbutton_continue.addActionListener(actionlistener_continue);
		
		}//constructor

	private void UpdateIndexAndIdentifier( )
		{
		Integer  l_selectedIndex      ;
		Integer  l_selectedIDentifier ;
		String   l_index_str          ;
		String   l_identifier_str     ;
				
		// Index.	
		l_selectedIndex = m_jcombobox_identifier.getSelectedIndex();

		// IDentifier.
		l_selectedIDentifier = m_jcombobox_identifier.getIdentifierAt( l_selectedIndex );

		// Labels.
		l_index_str      = String.valueOf( l_selectedIndex      );
		l_identifier_str = String.valueOf( l_selectedIDentifier );
		m_jlabel_index.setText( "Index= " + l_index_str );
		m_jlabel_identifier.setText( "IDentifier= " + l_identifier_str );
		
		}//UpdateIndexAndIdentifier

	}//class
///////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////
// EoF :: "JSX_JAVA_JFRame_IDentifier.java"
///////////////////////////////////////////////////////////////////
