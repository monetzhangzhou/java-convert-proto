package test.protostuff.runtime;

import com.dyuproject.protostuff.Tag;
import com.zz.generateproto.protostuff.runtime.MapObjectObject;
import com.zz.generateproto.protostuff.runtime.MapStringObject;
import com.zz.generateproto.protostuff.runtime.MapStringString;

/**
 * 
 * @author Alex Shvid
 *
 */

public class MapObjectClass {

	@Tag(1)
	protected MapStringString stringToString;

	@Tag(2)
	protected MapStringObject stringToObject;

	@Tag(3)
	protected MapObjectObject objectToObject;

}
