class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        total = len(students)
        count = 0
        while True:
            if students[0] == sandwiches[0]:
                total = total - 1
                count = 0
                students = students[1:]
                sandwiches = sandwiches[1:]
                print("STD")
                print(students)
                print("Snd")
                print(sandwiches)
            else:
                count = count + 1
                temp = students[0]
                students = students[1:]
                students.append(temp)
                print("STD")
                print(students)
                print("Snd")
                print(sandwiches)
            if count == len(students):
                break
        return total