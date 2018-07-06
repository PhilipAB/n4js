/**
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.json.JSON;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represents a JSON object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.n4js.json.JSON.JSONObject#getNameValuePairs <em>Name Value Pairs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.n4js.json.JSON.JSONPackage#getJSONObject()
 * @model
 * @generated
 */
public interface JSONObject extends JSONValue {
	/**
	 * Returns the value of the '<em><b>Name Value Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.n4js.json.JSON.NameValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The name-value associations stored in this object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Value Pairs</em>' containment reference list.
	 * @see org.eclipse.n4js.json.JSON.JSONPackage#getJSONObject_NameValuePairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<NameValuePair> getNameValuePairs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.n4js.json.JSON.NameValuePair%&gt;, &lt;%java.lang.String%&gt;&gt; _function = new &lt;%org.eclipse.xtext.xbase.lib.Functions.Function1%&gt;&lt;&lt;%org.eclipse.n4js.json.JSON.NameValuePair%&gt;, &lt;%java.lang.String%&gt;&gt;()\n{\n\tpublic &lt;%java.lang.String%&gt; apply(final &lt;%org.eclipse.n4js.json.JSON.NameValuePair%&gt; e)\n\t{\n\t\treturn e.toString();\n\t}\n};\n&lt;%java.lang.String%&gt; _join = &lt;%org.eclipse.xtext.xbase.lib.IterableExtensions%&gt;.join(&lt;%org.eclipse.emf.ecore.xcore.lib.XcoreEListExtensions%&gt;.&lt;&lt;%org.eclipse.n4js.json.JSON.NameValuePair%&gt;, &lt;%java.lang.String%&gt;&gt;map(this.getNameValuePairs(), _function), \",\\n\");\n&lt;%java.lang.String%&gt; _plus = (\"{\\n\" + _join);\nreturn (_plus + \"\\n}\");'"
	 * @generated
	 */
	String toString();

} // JSONObject
