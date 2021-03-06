/*
 * Copyright (C) 2009-2016 FBReader.ORG Limited <contact@fbreader.org>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.zlibrary.core.language;

import java.util.Locale;

import org.geometerplus.zlibrary.core.resources.ZLResource;

public abstract class LanguageUtil {
	public static Language language(String code) {
		return language(code, ZLResource.resource("language"));
	}

	public static Language language(String code, ZLResource root) {
		final ZLResource resource = root.getResource(code);
		return new Language(
			code,
			resource.hasValue() ? resource.getValue() : new Locale(code).getDisplayLanguage()
		);
	}
}
