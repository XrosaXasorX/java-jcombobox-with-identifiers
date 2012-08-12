///////////////////////////////////////////////////////////////////
//
// JESAX.NET [ http://www.jesax.net/ ] 
//  
// JAVA/script Environmental Subroutines for Accessible XML 
//  
// BoF :: "JSX_JAVA_NamVal.java"
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
import java.lang.Object;
import java.util.*;

///////////////////////////////////////////////////////////////////
//
// Class.
//
public class JSX_JAVA_NamVal 
	{

	int      m_jsx_java_val;
	String   m_jsx_java_nam;

	public JSX_JAVA_NamVal()
		{	
		this.m_jsx_java_val = 0;
		this.m_jsx_java_nam = "";
		}//constructor
		
	public void _SetVal( int p_val )
		{
		int l_val;
		l_val = p_val;
		this.m_jsx_java_val = l_val;
		}//_SetVal
	public int _GetVal( )
		{
		int l_val;
		l_val = this.m_jsx_java_val;
		return( l_val );
	}//_GetVal
	
	public void _SetNam( String p_nam )
		{
		String l_nam;
		l_nam = p_nam;
		this.m_jsx_java_nam = l_nam;
		}//_SetNam
	public String _GetNam( )
		{
		String l_nam;
		l_nam = this.m_jsx_java_nam;
		return( l_nam );
	}//_GetNam
 
	@Override public String toString()
		{
		String l_nam;
		l_nam = super.toString();
		l_nam = this._GetNam();
		return( l_nam );
		}//toString

	}//class
///////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////
// BoF :: "JSX_JAVA_NamVal.java"
///////////////////////////////////////////////////////////////////
