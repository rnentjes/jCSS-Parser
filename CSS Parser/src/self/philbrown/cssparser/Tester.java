package self.philbrown.cssparser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Tester 
{

	public static void main(String[] args)
	{
		CSSHandler handler = new DefaultCSSHandler();
		try
		{
			CSSParser parser = new CSSParser(getSampleInputStream(), handler);
			parser.debug();
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	private static InputStream getSampleInputStream()
	{
		String sample = "/*" +
		" * HTML5 Boilerplate" +
		" *" +
		" * What follows is the result of much research on cross-browser styling." +
		" * Credit left inline and big thanks to Nicolas Gallagher, Jonathan Neal," +
		" * Kroc Camen, and the H5BP dev community and team." +
		" */" +
		"" +
		"/* ==========================================================================" +
		"Base styles: opinionated defaults" +
		"========================================================================== */" +
		"" +
		"html," +
		"button," +
		"input," +
		"select," +
		"textarea {" +
		"    color: #222;" +
		"}" +
		"" +
		"body {" +
		"    font-size: 1em;" +
		"    line-height: 1.4;" +
		"}" +
		"" +
		"/*" +
		" * Remove text-shadow in selection highlight: h5bp.com/i" +
		" * These selection rule sets have to be separate." +
		" * Customize the background color to match your design." +
		" */" +
		"" +
		"::-moz-selection {" +
		"    background: #b3d4fc;" +
		"    text-shadow: none;" +
		"}" +
		"" +
		"::selection {" +
		"    background: #b3d4fc;" +
		"    text-shadow: none;" +
		"}" +
		"" +
		"/*" +
		" * A better looking default horizontal rule" +
		" */" +
		"" +
		"hr {" +
		"    display: block;" +
		"    height: 1px;" +
		"    border: 0;" +
		"    border-top: 1px solid #ccc;" +
		"    margin: 1em 0;" +
		"    padding: 0;" +
		"}" +
		"" +
		"/*" +
		" * Remove the gap between images and the bottom of their containers: h5bp.com/i/440" +
		" */" +
		"" +
		"img {" +
		"    vertical-align: middle;" +
		"}" +
		"" +
		"/*" +
		" * Remove default fieldset styles." +
		" */" +
		"" +
		"fieldset {" +
		"    border: 0;" +
		"    margin: 0;" +
		"    padding: 0;" +
		"}" +
		"" +
		"/*" +
		" * Allow only vertical resizing of textareas." +
		" */" +
		"" +
		"textarea {" +
		"    resize: vertical;" +
		"}" +
		"" +
		"/* ==========================================================================" +
		"   Chrome Frame prompt" +
		"   ========================================================================== */" +
		"" +
		".chromeframe {" +
		"    margin: 0.2em 0;" +
		"    background: #ccc;" +
		"    color: #000;" +
		"    padding: 0.2em 0;" +
		"}" +
		"" +
		"/* ==========================================================================" +
		"   Author's custom styles" +
		"   ========================================================================== */";

		return new ByteArrayInputStream(sample.getBytes());
	}
}