class Solution:
    # @return a list of lists of integer
    def generateMatrix(self, n):
    	if n == 0:
    		return[]
    	M = [[0 for col in range(n)] for row in range(n)]
    	up = 0
    	down = n
    	left = 0
    	right = n
    	dir = 0
    	count = 1
    	while True:
    		if dir == 0:
    			for i in range(left,right):
    				M[up][i] = count
    				count += 1
    			up += 1
    		elif dir == 1:
    			for i in range(up,down):
    				M[i][right] = count
    				count += 1
    			right -= 1
    		elif dir == 2:
    			for i in range(right-1, left-1, -1):
    				M[down][i] = count
    				count += 1
    			down -= 1
    		elif dir == 3:
    			for i in range(down-1, up-1, -1):
    				M[i][left] = count
    				count += 1
    			left -= 1
    		if count == n*n:
    			return M
    		dir = (dir+1)%4

