package net.javaguides.ems.mapper;

import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.entity.Department;

public class DepartmentMapper {
    //convert dept jpa entity to dept dto

    public static DepartmentDto mapToDepartmentDto(Department department){
         return new DepartmentDto(
                 department.getId(),
                 department.getDepartmentName(),
                 department.getDepartmentDescription()
         );

    }
    //convert dept dto to dept jpa entity
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
