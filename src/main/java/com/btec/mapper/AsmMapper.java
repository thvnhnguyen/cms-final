package com.btec.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.btec.model.AsmModel;

public class AsmMapper implements RowMapper<AsmModel> {

	@Override
	public AsmModel mapRow(ResultSet resultSet) {
		try {
			AsmModel asm = new AsmModel();
			asm.setAsmName(resultSet.getString("asmName"));
			asm.setBrief(resultSet.getString("asmBrief"));
			return asm;
		} catch (SQLException e) {
			return null;
		}
	}
}
