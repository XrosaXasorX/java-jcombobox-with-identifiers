///////////////////////////////////////////////////////////////////
//
// JESAX.NET [ http://www.jesax.net/ ] 
//  
// JAVA/script Environmental Subroutines for Accessible XML 
//  
// BoF :: "JSX_JAVA_JComboBox_IDentifier.java"
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
import java.util.ArrayList;
import javax.swing.JComboBox;
import java.awt.List;
import javax.swing.*; 
import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.lang.Object;
import java.util.*;

///////////////////////////////////////////////////////////////////
//
// Class.
//
public class JSX_JAVA_JComboBox_IDentifier extends JComboBox
	{

	ArrayList<JSX_JAVA_NamVal> m_namval_list;

	public JSX_JAVA_JComboBox_IDentifier()
		{	
		super( );

		m_namval_list = new ArrayList<JSX_JAVA_NamVal>();
		}//constructor
		
	public void addItem( Object[] p_obj )
		{ 
		String   l_jsx_nam; 
		int      l_jsx_val; 
		
		// Data.
		l_jsx_val = (Integer) p_obj[0];
		l_jsx_nam = (String)  p_obj[1];
		
		// Super.
		super.addItem( (Object)l_jsx_nam );

		JSX_JAVA_NamVal l_namval_obj;
		l_namval_obj = new JSX_JAVA_NamVal();
		l_namval_obj._SetNam( l_jsx_nam );
		l_namval_obj._SetVal( l_jsx_val );
		m_namval_list.add( l_namval_obj );

		}//addItem

	public int getIdentifierAt( int p_iIndex )
		{
		JSX_JAVA_NamVal l_namval_obj;
		int      l_val;
		
		// IDentifier.
		l_namval_obj = this.m_namval_list.get( p_iIndex );
		l_val = l_namval_obj._GetVal();

		// Return value.
		return( l_val );

		}//getIdentifierAt

	}//class
///////////////////////////////////////////////////////////////////
	
///////////////////////////////////////////////////////////////////
// EoF :: "JSX_JAVA_JComboBox_IDentifier.java"
///////////////////////////////////////////////////////////////////
