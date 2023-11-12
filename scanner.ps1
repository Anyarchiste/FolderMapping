<# Recusively scans the names of the files in a specific folder and outputs it to a .txt file
    Copyright (C) 2023  Anyarchiste

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>. #>

    $Path = Read-Host -Prompt 'Input the path to recusively parse through'

    Get-ChildItem $Path -Recurse | Out-String | Set-Content .\.gitignore\rawOutput.txt