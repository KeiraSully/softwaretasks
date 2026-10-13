# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!
from point import Point

p = Point(3.0, 4.0)
print(f"x = {p.x}, y = {p.y}")
print(f"Distance from origin: {p.distance()}")

q = Point(4.5, 7.0)
print(f"Distance to (4.5, 7.0): {p.distanceTo(q)}")