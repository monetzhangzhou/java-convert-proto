package test.protostuff.runtime;

import com.dyuproject.protostuff.Tag;
import com.zz.generateproto.protostuff.runtime.EnumObject;

/**
 * 
 * @author Alex Shvid
 *
 */

public class EnumObjectClass {

	@Tag(1)
	protected SimpleEnum simpleEnum;

	@Tag(2)
	protected StringEnum stringEnum;

	@Tag(3)
	protected EnumObject enumValue;

}
