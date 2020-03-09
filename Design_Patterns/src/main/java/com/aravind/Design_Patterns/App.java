package com.aravind.Design_Patterns;

import com.aravind.TemplatePattern.*;
import com.aravind.SingletonPattern.*;
import com.aravind.AdapterPattern.*;
import com.aravind.CommandPattern.*;
import com.aravind.PrototypePattern.*;
import com.aravind.BridgePattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}