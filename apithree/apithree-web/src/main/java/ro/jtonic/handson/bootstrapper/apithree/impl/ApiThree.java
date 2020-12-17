package ro.jtonic.handson.bootstrapper.apithree.impl;

import org.springframework.context.annotation.ComponentScan;
import ro.jtonic.handson.bootstrapper.common.annotation.EntryPoint;

/*
 * Readme:
 *  - As can be seen in this example the entrypoint class of the API doesn't have to comply with the *EntryPoint naming convention
 *  - But it is better to stay under the naming convention anyway.
 */
@EntryPoint
@ComponentScan
public class ApiThree {

}
